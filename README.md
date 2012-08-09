# clj-roomba

A sample project to do hacking with your Clojure REPL and your Roomba

## Setup
You need both native libraries and the RoombaComm library to get 
hacking.
* Install the following jars using the [localrepo plugin](https://github.com/kumarshantanu/lein-localrepo)
*        lein localrepo install roombacomm/roombacomm.jar roombacomm 0.96
*        lein localrepo install roombacomm/RXTXcomm.jar rxtxcomm 0103 
* Clojure jack-in and follow the example in core.clj to control your

## References
* [RoombaComm Java Library](http://hackingroomba.com/code/roombacomm/)
* [Setup for Bluetooth and Roomba](http://gigasquidsoftware.com/wordpress/?p=441)
* [iRobot Serial Command Interface](http://www.irobot.com/images/consumer/hacker/roomba_sci_spec_manual.pdf)

## License

Copyright © 2012 FIXME

Distributed under the Eclipse Public License, the same as Clojure.

