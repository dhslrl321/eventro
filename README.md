# eventro

This library may support building event driven architecture by **providing** below

- Message
  - provide 3 type of message
    - command message
    - event message
    - document message (not support now)
- MessageEnvelop
  - manage standardized message format
  - called [Envelop Wrapper Pattern](https://www.enterpriseintegrationpatterns.com/patterns/messaging/EnvelopeWrapper.html)
- **Idempotent Key**
  - make safer for event message duplication consumption
- **EventSerDes**
  - serialize or deserialize for your events to json
