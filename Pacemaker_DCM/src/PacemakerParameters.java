
/* this class might be unnecessary */

public class PacemakerParameters {

    int INPUT_NUM = 16;
    int OUTPUT_NUM = 3;
    int length = INPUT_NUM + OUTPUT_NUM;
    
    // operating modes of pacemaker
    enum PACEMAKER_MODE {
        VOO,
        AOO,
        VVI,
        AAI,
        NULL;
    }
    
    // p parameters
    public PACEMAKER_MODE p_mode;
    public float p_lower_rate_limit;
    float p_upper_rate_limit;
    float p_atr_pulse_amplitude;
    float p_vent_pulse_amplitude;
    float p_atr_pulse_width;
    float p_vent_pulse_width = 0;
    float p_atr_sensitivity;
    float p_vent_sensitivity;
    float p_vrp;
    float p_arp;
    float p_pvarp;
    boolean p_hysteresis_enable;
    float p_hysteresis_rate_limit;
    boolean p_rate_smoothing_enable;
    float p_rate_smoothing_percent;
    
    // h parameters
    float h_atr_pulse_detect;
    float h_vent_pulse_detect;
    
    // internal signals
    float start_pace;
}