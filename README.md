# Event Support

This library may support building event driven architecture by **providing** below

- **EventEnvelop**
  - manage consistent event data format 
  - called [Envelop Wrapper Pattern](https://www.enterpriseintegrationpatterns.com/patterns/messaging/EnvelopeWrapper.html)
- **Idempotent Key**
  - make safer for event message duplication consumption
- **EventSerDes**
  - serialize or deserialize for your events to json
