# Use Cases

## 1. View company qualifications

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects company qualifications (normal) | Returns list of company qualifications. |
| User  | Selects company qualifications (empty) | Returns empty list. |

## 2. View company employed worker

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects company employed worker (normal) | Returns list of employed workers. |
| User  | Selects company employed worker (empty) | Returns empty list. |

## 3. View company projects

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects company projects (normal) | Returns list of company projects. |
| User  | Selects company projects (empty) | Returns empty list. |

## 4. View qualification details

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a qualification (normal) | Returns list of details for specific qualification. |
| User  | Selects a qualification (empty qualification) | Returns empty list. |

## 5. View worker details

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a worker (normal) | Returns list of details for specific worker. |

## 6. View project details

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a project (normal) | Returns list of details for specific project. |
| User  | Selects a project (empty project) | Returns empty list. |

## 7. Create new qualification

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a qualification description (normal) | Creates a new qualification. |
| User  | Selects a qualification description (empty description) | CReturns an empty description error. |

## 8. Create new worker

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a worker name, qualifications, and salary (normal) | Creates a new worker. |
| User  | Selects a worker name, qualifications, and salary (empty quals) | Return an empty quals error. |
| User  | Selects a worker name, qualifications, and salary (empty name) | Return an empty name error. |
| User  | Selects a worker name, qualifications, and salary (negative salary) | Return a negative salary error. |

## 9. Create new project

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a project name, qualifications, and size (normal) | Creates a new project. |
| User  | Selects a project name, qualifications, and size (empty quals) | Return an empty quals error. |
| User  | Selects a project name, qualifications, and size (empty name) | Return an empty name error. |
| User  | Selects a project name, qualifications, and size (null size) | Return a project size error. |


## 10. Assign worker

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a project and a worker (normal) | Assigns the worker to the project. |
| User  | Selects a project and a worker (project active) | Return project active error. |
| User  | Selects a project and a worker (worker overload) | Return overload error. |

## 11. Unassign worker

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a project and a worker (normal) | Unassigns the worker from the project. |
| User  | Selects a project and a worker (project active) | Return project active error. |
| User  | Selects a project and a worker (empty project) | Return empty project error. |

## 12. Start project

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a project (normal) | Changes the project status to "Active". |
| User  | Selects a project (missing qualifications) | Return unfilled quals error. |
| User  | Selects a project (finished project) | Return finished project error. |
| User  | Selects a project (active project) | Return already active project error. |
| User  | Selects a project (non-existent project) | Returnt unknown project error. |

## 13. Finish project

| Actor | Action | System Response |
|-------|--------|-----------------|
| User  | Selects a project (normal) | Changes the project status to "Finished". |
| User  | Selects a project (finished) | Return already finished project error. |
| User  | Selects a project (suspended) | Return project suspended error. |
| User  | Selects a project (non-existent) | Return unknown project error. |
| User  | Selects a project (planned) | Return project planned error. |

