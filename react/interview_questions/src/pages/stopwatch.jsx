import { useEffect } from "react";
import { useState } from "react";

export default function Stopwatch() {
  const [timerRunning, setTimerRunning] = useState(false);
  const [timer, setTimer] = useState(0);

  useEffect(() => {
    let stopWatch = null;
    if (timerRunning) {
      stopWatch = setInterval(() => {
        setTimer((prev) => prev + 1);
      }, 1000);
    }

    return () => clearInterval(stopWatch);
  }, [timer, timerRunning]);

  return (
    <main>
      <div>{timer}</div>
      <button onClick={() => setTimerRunning(true)}>Start</button>
      <button onClick={() => setTimerRunning(false)}>Stop</button>
    </main>
  );
}
