# Beginner Java Bug Hunt — Open-Source Hackathon Starter

Welcome! This repository contains small Java programs with intentional bugs for beginner-friendly issue-fixing practice.

## Repository contents

- `src/main/java/hackathon/` — starter Java files to debug.
- `issues/` — issue descriptions grouped by difficulty.
- `ISSUES.md` — index of all tasks and links to the local issue descriptions.
- `CONTRIBUTING.md` — branch, commit, test, and pull request workflow.
- `team-assignments.csv` — organizer's assignment tracker.

## Requirements

- Java JDK 17 or later.
- Git.
- A code editor or terminal.

The exercises use plain Java and do not require external dependencies.

## Run one exercise

From the repository root, for example:

```bash
javac src/main/java/hackathon/Issue01_EvenOdd.java
java -cp src/main/java/hackathon Issue01_EvenOdd
```

The starter code may compile but produce incorrect results. Some exercises may need you to add tests or adjust code before all expected cases pass.

## Hackathon workflow

1. Read the issue assigned to you in `issues/`.
2. Create a branch for that issue.
3. Reproduce the bug and understand the expected behavior.
4. Make a small fix and test it.
5. Commit locally while offline.
6. When Wi-Fi is available, push your branch and open a PR referencing the real GitHub Issue.

Example:

```bash
git switch -c fix/issue-01
git status
git diff
git add src/main/java/hackathon/Issue01_EvenOdd.java
git commit -m "Fix even odd checker"
git push -u origin fix/issue-01
```

## Important for organizers

This is a teaching/demo repository. The tasks are intentionally created for this exercise; they are not issues from external open-source projects. If using a real external project, confirm the maintainer welcomes the contribution and follow that project's contribution guidelines.

For an offline event, distribute a copy of this repository and its issue descriptions before Wi-Fi is disabled. Git commits work offline; pushing and creating PRs require internet access.
