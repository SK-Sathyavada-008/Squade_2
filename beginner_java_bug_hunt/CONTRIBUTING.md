# Contributing

## Before coding
- Read `README.md` and your assigned issue description.
- Work only on the issue assigned to you.
- Do not make unrelated formatting or cleanup changes.

## One issue, one branch, one PR
Use a separate branch for every independent issue. Start from the base branch before creating each issue branch.

```bash
git switch main
git switch -c fix/issue-01
```

After implementing and testing your fix:

```bash
git status
git diff
git add src/main/java/hackathon/Issue01_EvenOdd.java
git commit -m "Fix even odd checker"
```

When internet is available, push the branch:

```bash
git push -u origin fix/issue-01
```

Then open a pull request on GitHub. A push uploads the branch; it does not automatically create a PR.

## PR description checklist
- What was the bug?
- What did you change?
- How did you test it?
- Reference the real GitHub Issue, for example `Closes #12`, if applicable.

## Offline reminder
You can edit files, run locally available tools, create branches, and commit without internet. Pushing branches, opening PRs, and reviewing online discussions require internet.
