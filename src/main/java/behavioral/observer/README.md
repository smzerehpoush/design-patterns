Observer Design Pattern
By Lokesh Gupta

According to GoF definition, observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.

In observer pattern, there are many observers (subscriber objects) that are observing a particular subject (publisher object). Observers register themselves to a subject to get a notification when there is a change made inside that subject.

A observer object can register or unregister from subject at any point of time. It helps is making the objects objects loosely coupled.

1. When to use observer design pattern
As described above, when you have a design a system where multiple entities are interested in any possible update to some particular second entity object, we can use the observer pattern.

Observer Pattern
Observer Pattern
The flow is very simple to understand. Application creates the concrete subject object. All concrete observers register themselves to be notified for any further update in the state of subject.

As soon as the state of subject changes, subject notifies all the registered observers and the observers can access the updated state and act accordingly.

Observer Pattern Sequence Diagram
Observer Pattern Sequence Diagram
2. Real world example of observer pattern
A real world example of observer pattern can be any social media platform such as Facebook or twitter. When a person updates his status – all his followers gets the notification.
A follower can follow or unfollow another person at any point of time. Once unfollowed, person will not get the notifications from subject in future.

In programming, observer pattern is the basis of message oriented applications. When a application has updated it’s state, it notifies the subscribers about updates. Frameworks like HornetQ, JMS work on this pattern.
Similarly, Java UI based programming, all keyboard and mouse events are handled by it’s listeners objects and designated functions. When user click the mouse, function subscribed to the mouse click event is invoked with all the context data passed to it as method argument.
3. Observer design pattern
3.1. Architecture
Observer Pattern Architecture
Observer Pattern Architecture
3.2. Design participants
The observer pattern has four participants.

Subject – interface or abstract class defining the operations for attaching and de-attaching observers to the subject.
ConcreteSubject – concrete Subject class. It maintain the state of the object and when a change in the state occurs it notifies the attached Observers.
Observer – interface or abstract class defining the operations to be used to notify this object.
ConcreteObserver – concrete Observer implementations.