# [Java] -- Queue (Data Structure)
## Algorithm: "Design Circular Queue"

Filepath = algorithm-practice/Leet_Code/03-queue_and_stack/01-queuefirstinfirstoutdatastructure-CircularQueue/

#### What is a Circular Queue?
Well, a **normal queue** is a simple ArrayList with properties that allow for FIFO-handling, (First In First Out handling).

A **circular queue** has the same handling. The difference is, it is more memory efficient. Any element containers that have been removed from the queue become usable space. This allows us to use an array as opposed to an ArrayList because we can set a fixed amount of space, but as long as we remove elements and reuse the space, the queue will be able to process a sizable amount of in-and-out data.

<!--Circular queue animation image-->
![circular queue animation](https://i.gifer.com/R70N.gif)

<div style="text-align: right"> <a href="https://i.gifer.com/R70N.gif">image credits</a></div>

