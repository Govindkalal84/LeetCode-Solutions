# ⚡ LeetCode Solutions (Java Engine)

[![LeetCode Profile](https://img.shields.io/badge/LeetCode-Govindkalal-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/u/Govindkalal/)
[![50 Days Badge 2026](https://img.shields.io/badge/Award-50_Days_Badge_2026-brightgreen?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/u/Govindkalal/)
[![Java](https://img.shields.io/badge/Language-Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Automated Sync](https://img.shields.io/badge/Sync-LeetHub_v2-2563EB?style=for-the-badge&logo=github&logoColor=white)](https://github.com/arunbhardwaj/LeetHub-2.0)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](LICENSE)

An automated synchronization repository cataloging **Accepted LeetCode algorithmic solutions in Java**, organized by problem difficulty, time complexity, and memory efficiency. Powered by **LeetHub v2**.

---

## 📊 Live LeetCode Progress & Credentials

<div align="center">
  <table border="0">
    <tr>
      <td align="center" width="60%">
        <a href="https://leetcode.com/u/Govindkalal/" target="_blank">
          <img src="https://leetcard.jacoblin.cool/Govindkalal?theme=tokyonight&font=Fira%20Code" alt="Govind's LeetCode Stats" />
        </a>
      </td>
      <td align="center" width="40%">
        <a href="https://leetcode.com/u/Govindkalal/" target="_blank">
          <img src="https://assets.leetcode.com/static_assets/others/50_1080_1080.png" width="130" alt="LeetCode 50 Days Badge 2026" />
        </a>
        <br />
        <strong>🏆 50 Days Badge 2026</strong>
        <br />
        <sub>Earned for 50+ days of disciplined daily problem-solving.</sub>
      </td>
    </tr>
  </table>
</div>

---

## 🔄 Automated Synchronization Architecture

`mermaid
sequenceDiagram
    autonumber
    actor Dev as Developer (Govind)
    participant LC as LeetCode.com
    participant LH as LeetHub v2 Extension
    participant GH as GitHub (LeetCode-Solutions)

    Dev->>LC: Write & Submit Solution (Java)
    LC-->>Dev: Status: ACCEPTED (Runtime, Memory)
    LH->>LC: Intercept Accepted Submission Event
    LH->>LH: Extract Code, Problem Description & Complexity Metrics
    LH->>GH: Automated Git Commit & Push to main
    GH-->>Dev: Increments GitHub Contribution Graph (Green Square)
`

---

## 📂 Repository Structure

Whenever a problem is accepted on LeetCode, LeetHub automatically commits the solution and problem details into clean folders:

`	ext
LeetCode-Solutions/
├── 0001-two-sum/
│   ├── README.md               # Problem description, constraints, and tags
│   └── Solution.java           # Accepted Java code with runtime & memory notes
├── 0015-3sum/
│   ├── README.md
│   └── Solution.java
└── 0200-number-of-islands/
    ├── README.md
    └── Solution.java
`

---

## ⚡ How to Connect LeetHub to this Repository

1. Install **[LeetHub v2](https://chromewebstore.google.com/detail/leethub-v2/mhanfgfagplhgemgemhkfeebcmgknnac)** from the Chrome Web Store.
2. Click the LeetHub extension icon and click **Authorize with GitHub**.
3. Under **Repository Name**, choose **Existing Repository** and select:
   `
   Govindkalal84/LeetCode-Solutions
   `
4. Click **Get Started**.
5. Solve any problem on LeetCode and click **Submit**. Once you see **"Accepted"**, LeetHub will automatically push the code to this repository within 3 seconds!

---

## 👨‍💻 Author

**Govind Sadhanande**  
Java Backend & Full Stack Developer | Bengaluru, India  
- **LeetCode:** [leetcode.com/u/Govindkalal](https://leetcode.com/u/Govindkalal/)  
- **Portfolio:** [govind-portfolio-dev.vercel.app](https://govind-portfolio-dev.vercel.app/)  
- **GitHub:** [@Govindkalal84](https://github.com/Govindkalal84)  
- **LinkedIn:** [linkedin.com/in/govind-sadhanande](https://linkedin.com/in/govind-sadhanande)
<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0015-3sum](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0015-3sum) |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0167-two-sum-ii-input-array-is-sorted) |
| [0209-minimum-size-subarray-sum](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0209-minimum-size-subarray-sum) |
| [0643-maximum-average-subarray-i](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0643-maximum-average-subarray-i) |
| [0904-fruit-into-baskets](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0904-fruit-into-baskets) |
| [1004-max-consecutive-ones-iii](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1004-max-consecutive-ones-iii) |
## Sliding Window
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0003-longest-substring-without-repeating-characters) |
| [0209-minimum-size-subarray-sum](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0209-minimum-size-subarray-sum) |
| [0438-find-all-anagrams-in-a-string](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0438-find-all-anagrams-in-a-string) |
| [0567-permutation-in-string](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0567-permutation-in-string) |
| [0643-maximum-average-subarray-i](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0643-maximum-average-subarray-i) |
| [0904-fruit-into-baskets](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0904-fruit-into-baskets) |
| [1004-max-consecutive-ones-iii](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1004-max-consecutive-ones-iii) |
| [1208-get-equal-substrings-within-budget](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1208-get-equal-substrings-within-budget) |
| [1456-maximum-number-of-vowels-in-a-substring-of-given-length](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1456-maximum-number-of-vowels-in-a-substring-of-given-length) |
## String
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0003-longest-substring-without-repeating-characters) |
| [0125-valid-palindrome](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0125-valid-palindrome) |
| [0242-valid-anagram](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0242-valid-anagram) |
| [0438-find-all-anagrams-in-a-string](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0438-find-all-anagrams-in-a-string) |
| [0567-permutation-in-string](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0567-permutation-in-string) |
| [1208-get-equal-substrings-within-budget](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1208-get-equal-substrings-within-budget) |
| [1456-maximum-number-of-vowels-in-a-substring-of-given-length](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1456-maximum-number-of-vowels-in-a-substring-of-given-length) |
## Hash Table
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0003-longest-substring-without-repeating-characters) |
| [0242-valid-anagram](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0242-valid-anagram) |
| [0438-find-all-anagrams-in-a-string](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0438-find-all-anagrams-in-a-string) |
| [0567-permutation-in-string](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0567-permutation-in-string) |
| [0904-fruit-into-baskets](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0904-fruit-into-baskets) |
## Binary Search
|  |
| ------- |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0167-two-sum-ii-input-array-is-sorted) |
| [0209-minimum-size-subarray-sum](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0209-minimum-size-subarray-sum) |
| [1004-max-consecutive-ones-iii](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1004-max-consecutive-ones-iii) |
| [1208-get-equal-substrings-within-budget](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1208-get-equal-substrings-within-budget) |
## Prefix Sum
|  |
| ------- |
| [0209-minimum-size-subarray-sum](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0209-minimum-size-subarray-sum) |
| [1004-max-consecutive-ones-iii](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1004-max-consecutive-ones-iii) |
| [1208-get-equal-substrings-within-budget](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/1208-get-equal-substrings-within-budget) |
## Two Pointers
|  |
| ------- |
| [0015-3sum](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0015-3sum) |
| [0125-valid-palindrome](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0125-valid-palindrome) |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0167-two-sum-ii-input-array-is-sorted) |
| [0567-permutation-in-string](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0567-permutation-in-string) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0015-3sum) |
| [0242-valid-anagram](https://github.com/Govindkalal84/LeetCode-Solutions/tree/master/0242-valid-anagram) |
<!---LeetCode Topics End-->