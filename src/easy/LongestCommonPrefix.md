Given an array of strings str, return the longest common prefix string amongst an array of strings. If there is no longest common prefix string exists, return an empty string.

Examples
Example 1:

Input: strs = ["digital","dig","dinner"]
Expected Output: "di"
Justification: The strings share the initial fragment "di", but not beyond that. "dinner" diverges starting from the third character, making "di" the longest common prefix.
Example 2:

Input: strs = ["happy","harbor","hard"]
Expected Output: "ha"
Justification: All strings start with "ha", but diverge afterwards. Hence, "ha" is the longest common prefix.
Example 3:

Input: strs = ["apple","application","appetite", "app"]
Expected Output: "app"
Justification: The strings share the starting fragment "app", beyond which they start to differ. Therefore, "app" is identified as the longest common prefix.