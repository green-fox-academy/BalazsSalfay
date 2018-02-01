package com.greenfoxacademy.licenceplatesearch.models;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SearchChecker {

  List<Character> enabledCharacters;

  public SearchChecker() {
    this.enabledCharacters = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                                          'P','Q','R','S','T','U','V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
                                          'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                                          'w', 'x', 'y', 'z', '-', '0', '1', '2', '3', '4',
                                          '5', '6', '7', '8', '9');
  }

  public boolean isItAValidSearch(String input) {
    for (int i = 0; i < input.length(); i++) {
      if (!enabledCharacters.contains(input.charAt(i)) || input.length() > 7 ) {
        return false;
      }
    }
    return true;
  }
}
