Yes node is entirely single threaded.

However it has async behavior which keeps the main thread as non blocking and hence the main thread is not blocked.

Callbacks, Promises, Async/Await are the ways to achieve async behavior in node.

They are regulated and controlled by the event loop.

The event loop is a single thread that performs all the async operations.

![See the Architecture of Event Loop](https://www.freecodecamp.org/news/content/images/2021/08/1-1.PNG)

Major parts of the event loop are:

- Call Stack (Where the code is executed)
- Node APIs (Blocking Functions are here)
- Callback Queue (Where the callbacks are stored)
- Event Loop (Which checks the Call Stack and Callback Queue)
