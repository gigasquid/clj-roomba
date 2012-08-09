(ns clj-roomba.core
  (:import roombacomm.RoombaCommSerial))

(println (System/getProperty "java.class.path"))
(println (System/getProperty "java.library.path"))

(def roomba (RoombaCommSerial. ))

;;Find your port for your Roomba
(map println (.listPorts roomba))
(def portname "/dev/cu.FireFly-943A-SPP")
(.connect roomba portname)
(.startup roomba)  ;;puts Roomba in safe Mode
;; What mode is Roomba in?
(.modeAsString roomba)
(.control roomba)
(.updateSensors roomba) ; returns true if you are connected


(.pause roomba 30)
(.playNote roomba 72 40)
(.playNote roomba 79 40)
(.spinLeft roomba)
(.spinRight roomba)
(.goBackward roomba)
(.goForward roomba)
(.turnLeft roomba)
(.turnRight roomba)

(.stop roomba)
(.reset roomba)
(.vacuum roomba true)
(.vacuum roomba false)

;; Get the sensor data
(.updateSensors roomba) 
(.bumpLeft roomba)
(.bumpRight roomba)
(.wheelDropLeft roomba)
(.wheelDropRight roomba)
(.wheelDropCenter roomba)
(.sensorsAsString roomba)


(defn bark [r]
  (doto r
    (.vacuum true)
    (.playNote 50 5)
    (.pause 150)
    (.vacuum false)))

(bark roomba)

(.disconnect roomba)