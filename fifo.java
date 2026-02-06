<script>

// JavaScript program to demonstrate
// working of FIFO
// using Queue interface in Java

let q = [];
// Adds elements {0, 1, 2, 3, 4} to queue
for (let i = 0; i < 5; i++)
    q.push(i);

// Display contents of the queue.
document.write("Elements of queue-[" + q.join(", ")+"]<br>");

// To remove the head of queue.
// In this the oldest element '0' will be removed
let removedele = q.shift();
document.write("removed element-" + removedele+"<br>");

document.write("["+q.join(", ")+"]<br>");

// To view the head of queue
let head = q[0];
document.write("head of queue-" + head+"<br>");

// Rest all methods of collection interface,
// Like size and contains can be used with this
// implementation.
let size = q.length;
document.write("Size of queue-" + size+"<br>");


// This code is contributed by avanitrachhadiya2155

</script>
