
# Module design

## OVERALL DESIGN

![](https://github.com/aokit-mcmaster/lab1-group8/blob/master/images/MASTER-diagram.png)

## DEVICE-CONTROLLER MONITOR

**DCM Login Form**

![](https://i.imgur.com/HjHDj3R.gif)

**DCM Registration Form (ADMIN VIEW)**

![](https://i.imgur.com/RLxQ9UD.gif)

**DCM Program**

![](https://i.imgur.com/j1wkEK6.gif)

![](https://i.imgur.com/ueCVjXs.gif)

![](https://i.imgur.com/OsLuzRK.gif)

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
