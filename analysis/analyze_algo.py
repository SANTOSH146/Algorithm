import os
import re
import json

metrics = {
    "problems": 0,
    "nestedLoops": 0,
    "recursionUsed": 0
}

# Scan all folders except CI config and metrics
for root, _, files in os.walk("."):
    if any(skip in root for skip in [".git", "metrics", "analysis", ".github"]):
        continue

    for file in files:
        if file.endswith(".java"):
            metrics["problems"] += 1
            code = open(os.path.join(root, file)).read()

            # nested loops detection
            if len(re.findall(r"for\s*\(", code)) >= 2:
                metrics["nestedLoops"] += 1

            # naive recursion detection (function calling itself)
            className = file.replace(".java", "")
            if className in code:
                metrics["recursionUsed"] += 1

# Write metrics.json
os.makedirs("metrics", exist_ok=True)
with open("metrics/metrics.json", "w") as f:
    json.dump(metrics, f, indent=2)

print("📊 Metrics updated:", metrics)
