# Approaching System Design Interview Questions

### Understand the problem

1. Ask for questions clarifying the system you want to build
2. Gather all the features and modules a system consists that you know and ask the interviewer if you are correct.
3. Ask to narrow down the use case of the system to maybe 1 or 2 features which can be designed in an hour
4. Ask for the numbers - users, songs, products etc.. based on the system
5. Calculate and assume high level metrics such as storage capacity you want, databases, blog storage etc.. File Size per content for your system
6. Calculate the amount of data you’ll be dealing with
7. Also get the rough estimation of the trafiic coming to your system per day/second , to get the rough idea of how much bandwidth you need

### Before starting your high level design, calculate the high level metrics o determine the scalability of the system, Ex- users, songs, songs meta data

1. Layout the basic components of your design like app(desktop/mobile), cloud servers, load balancers, database
2. Outline your database design
3. Identify the entities with their attributes (OOPs), blob storage like aws s3 and seperate it into different DBs according to their usecase like no. of quesries, mutability, size of data etc..

After Design High Level Design now go through the use case of the system you want to design

### Drill down the bottleneck - Handling the edge cases

1. Handling lots of traffic - may crash
2. Probably use caching (CDN to deliver blobs of data) or maybe we can add a layer of Redis on the Realational DB to fetch data from cached memory
3. Maybe cache the queries on local storage of the application on client side to load much faster without even requesting the server
4. Multi-level caching to provide good user experience and its fast
5. Explaining Load balancing and how will you plan this
6. Placing Data globaly close to the user base (optional) Geo - location idea

### Wrapping Up

1. Wrap up your answer by outlining how it meets the requirements.
2. End of interview is a chance to think big and introduce a new Dimention.
