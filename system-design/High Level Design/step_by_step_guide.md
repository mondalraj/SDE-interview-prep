Framework to solve a system design problem in an interview

1. Understand the problem and establish design scope (5 min)

   1. Ask questions to clarify functional requirements
      - Why are we building this system?
      - Who are the users?
      - What features we need to build in priority order?
   2. Ask questions to clarify the non-functionl requirements
      - Scale
      - Storage
      - Performance
      - Do some rough calculations and metrics to understand the challenges and bottlenecks of the application

2. Propose high-level design and get buy-in (20 min)

   1. Start with the APIs (Derive it from the requirements)

      - What are the input parameters and response of each API?

   2. Layout the high level design diagram

      - Blueprient of the overall design we can referred back to
      - Verify that the design satisfy all the requirements end to end

   3. Start wih Load Balancers or API Gateway
      - Introduce the data storage layer
      - Do not focus on the right database to choose at this tep, keep it for the deep dive step - You can define DB Schemas (Optional)

- Protip (While design the HLD, keep a list of discussions for the later)
  - Database Scaling
  - High Concurrency
  - Failure Scenarios (Traffic Spike, Database Failure, Network Failure, etc)

3. Design deep dive (15 min)

   - Data Model and Schemas
     - Discuss the data model and schemas
     - Discuss the data access patterns
     - Discuss the read/write ratio
     - Maybe try to choose the right database
   - Discuss the data partitioning and sharding
   - Discuss the data replication and consistency
   - Discus the point of failure

4. Wrap up (5 min)

   - Spend time to fo through the design again - Ask Interview the questions about the company
