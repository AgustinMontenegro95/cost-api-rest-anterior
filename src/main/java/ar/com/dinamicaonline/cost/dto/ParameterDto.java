package ar.com.dinamicaonline.cost.dto;

public class ParameterDto {
    private String parameterName;
    private String parameterValue;
    
    @Override
    public String toString() {
        return "ParameterDto [parameterName=" + parameterName + ", parameterValue=" + parameterValue + "]";
    }
    public String getParameterName() {
        return parameterName;
    }
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
    public String getParameterValue() {
        return parameterValue;
    }
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
}
