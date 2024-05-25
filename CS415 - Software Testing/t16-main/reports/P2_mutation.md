# Before Improvement

| Class         | Mutation Score / Strength |
| ------------- | ------------------------- |
| Company       | 56/73 84%                 |
| Project       | 28/31 90%                 |
| Qualification | 15/16 94%                 |
| Worker        | 41/46 89%                 |

# After Improvement

| Class         | Mutation Score / Strength |
| ------------- | ------------------------- |
| Company       | 69/69 100%                |
| Project       | 33/33 100%                |
| Qualification | 17/17 100%                |
| Worker        | 44/44 100%                |

# Reflection
Using PIT Mutation analysis helped us find holes in our tests that allowed faulty implementations slip though without failing.
It also revealed a couple impossible states in our implementations that could not be reached but were vulnerable to mutations.
This helped us improve our implementation as well as tests for all of the class models created in P1.

# Tests
### Company
- companyPIT1
- companyPIT2
- companyPIT3
- companyPIT4

### Project
- projectGetNamePIT
- projectIsHelpfulPIT
- projectProjectDTOPIT

### Worker
- workerPIT1
- workerPIT2
- workerPIT3
- workerPIT4

