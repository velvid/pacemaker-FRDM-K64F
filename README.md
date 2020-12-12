
# Module design

## OVERALL DESIGN

![](https://github.com/aokit-mcmaster/lab1-group8/blob/master/images/MASTER-diagram.png)

## DEVICE-CONTROLLER MONITOR (DCM)

**DCM Login Form**

![](https://i.imgur.com/HjHDj3R.gif)

- The main login screen with a heart animation (source: https://docjana.com/cardiac-cycle/)
- Can add up to 10 users and remove them (as long as you know user/pass)
- Upon login, main interface will appear

**DCM Registration Form**

![](https://i.imgur.com/RLxQ9UD.gif)

- Can edit users from window accessible from main interface
- Can remove users without knowing passwords (an admin privilege)
- Can add up to 10 users and view all registered users

**DCM Interface (changing/saving/loading parameters)**

![](https://i.imgur.com/j1wkEK6.gif)

- Can change pacing modes and relevant parameters are hidden/shown
- Can edit parameters with spinner arrows within set bounds
- Can also save parameters to exported text file, and load them any time

**DCM Serial Communication**

![](https://i.imgur.com/ueCVjXs.gif)

- Connect to pacemaker hardware over USB serial communication (using UART protocol)
- Upon successful connection, can send/view parameters
- Can view electrogram to see atrial/ventricular signals real time

**DCM Logout/Login Screen**

![](https://i.imgur.com/OsLuzRK.gif)

- Can logout of the interface to view login screen again

## UTILITIES

### PACE
| Inputs | p\_mode, p\_...\_pulse\_width, start\_pace|
| --- | --- |
| Outputs | HARDWARE\_PINS |

![](https://github.com/aokit-mcmaster/lab1-group8/blob/master/images/PACE-state-diagram.png)

### SENSE
| Inputs | p\_mode, p\_arp, p\_vrp, p\_pvarp |
| --- | --- |
| Outputs | h\_...\_pulse\_detect |

![](https://github.com/aokit-mcmaster/lab1-group8/blob/master/images/SENSE-state-diagram.png)

## MODES

### VOO
| Inputs | p\_lower\_rate\_limit, p\_upper\_rate\_limit |
| --- | --- |
| Outputs | start_pace |

### AOO
| Inputs | p\_lower\_rate\_limit, p\_upper\_rate\_limit |
| --- | --- |
| Outputs | start_pace |

### VVI
| Inputs | p\_lower\_rate\_limit, p\_upper\_rate\_limit, p\_hysteresis\_enable, p\_hysteresis\_rate\_limit, p\_rate\_smoothing\_enable, p\_rate\_smoothing\_percent |
| --- | --- |
| Outputs | start_pace |

### AAI
| Inputs | p\_lower\_rate\_limit, p\_upper\_rate\_limit, p\_hysteresis\_enable, p\_hysteresis\_rate\_limit, p\_rate\_smoothing\_enable, p\_rate\_smoothing\_percent |
| --- | --- |
| Outputs | start_pace |
