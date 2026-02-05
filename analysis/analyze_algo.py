import os
import re
import json

metrics = {
    "problems": 0,
    "nestedLoops": 0,
    "recursionUsed": 0
}

for root, _, files in os.walk("algorithms"):
    for file in files:
        if file.endswith(".java"):
            metrics["problems"] += 1
            code = open(os.path.join(root, file)).read()

            if len(re.findall(r"for\s*\(", code)) >= 2:
                metrics["nestedLoops"] += 1

            if re.search(r"\bvoid\b|\bint\b.*\(", code) and "return" in code:
                if file.replace(".java", "") in code:
                    metrics["recursionUsed"] += 1

os.makedirs("metrics", exist_ok=True)

with open("metrics/metrics.json", "w") as f:
    json.dump(metrics, f, indent=2)

print("📊 Metrics updated:", metrics)
