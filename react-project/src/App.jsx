import React from "react";
import EventList from "./components/EventList";
import EventForm from "./components/EventForm";

function App() {
  return (
    <div className="App">
      <h1>Event Management</h1>
      <EventForm />
      <EventList />
    </div>
  );
}

export default App;
