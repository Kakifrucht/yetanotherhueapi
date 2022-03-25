package io.github.zeroone3010.yahueapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiInitializationSuccess {
  private String username;

  public String getUsername() {
    return username;
  }

  @Override
  public String toString() {
    return JsonStringUtil.toJsonString(this);
  }
}
