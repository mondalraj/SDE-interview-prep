1. Vertical Scaling

   - Increase the size of the instance (CPU, RAM, Storage)
   - Disadvantage: Costly, Limited, Single point of failure

2. Horizontal Scaling

   - Increase the number of instances (replicas)
   - Advantage: Cost effective, Scalable, High availability
   - Disadvantage: Synchronization, Data consistency, Complicated in distributing load across instances

3. Load Balancer (Server known as reverse-proxy)

   - It directs loads to the appropriate server based on the load balancing algorithm
   - Round Robin Algorithm: Distribute the load equally to all the servers
   - Consistent Hashing Algorithm: Distribute the load based on the hash value of the request
   - Geographic Load Balancing: Distribute the load based on the geographic location of the user

4. Content Delivery Network (CDN)

   - It is a network of distributed servers that deliver web content to the user based on the geographic location of the user
   - It is used to reduce the latency of the web content delivery
   - It is used to reduce the load on the server
   - It is used to reduce the bandwidth consumption
   - It is used to increase the availability of the web content
   - CDN is used to cache the static content of the website

5. Caching

   - It is used to store the frequently accessed data in the memory (CPU)

6. TCP/IP

   - Transmission Control Protocol (TCP) is used to establish a connection between the client and the server
   - Internet Protocol (IP) is used to send the data over the network

7. DNS

   - Domain Name System (DNS) is used to convert the domain name to the IP address

8. API Patterns

   - Representational State Transfer (REST)
   - GraphQL (It only fetch the data that is requested by the client)
   - gRPC

9. Web Sockets

   - Supports bidirectional communication between the client and the server
   - It is used to send the data from the server to the client without the client requesting for the data
   - Apllication: Chat application, Stock market application

10. Databases (SQL/noSQL)

    - SQL: MySQL, PostgreSQL, Oracle, Microsoft SQL Server
    - noSQL: MongoDB, Cassandra, Redis, DynamoDB

11. ACID

    - Atomicity: All or nothing
    - Consistency: Data is consistent before and after the transaction (Foreign key constraint)
    - Isolation: Concurrent transactions do not affect each other
    - Durability: Once the transaction is committed, it is permanent

12. Sharding (Database Scaling)

    - It is used to distribute the data across multiple databases (horizontal scaling)
    - It is used to reduce the load on the database
    - But which data to send on which database is a complex thing to decide.(Range based sharding, Hash based sharding)

13. Database Replication (Database Scaling)

    - It is used to create a copy of the database
    - It is used to increase the availability of the database
    - It is used to reduce the load on the database
    - If read is more than write, then we can use database replication (Leader-follower replication, Master-slave replication). If write is more than read, then we cannot use database replication.
    - Leader-Leader Replication: Both the databases can be used for read and write (problem with data consistency)

14. CAP Theorem (Database Scaling)

    - Consistency: All the nodes have the same data at the same time
    - Availability: All the nodes are available to perform read and write operations
    - Partition Tolerance: The system continues to work even if there is a network partition
    - CAP Theorem states that we can only have two of the above three properties at a time

15. Message Queues

    - It is used to send the messages from one service to another service
    - It is used to decouple the services
    - It is used to reduce the load on the server
    - It is used to increase the availability of the server
    - It is used to handle the traffic spikes
    - It is used to handle the asynchronous requests
