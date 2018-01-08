package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong counter2 = new AtomicLong();

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag",
          "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom",
          "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit",
          "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
          "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam",
          "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  String[] colors = {"red", "orange", "blue", "green", "purple", "grey", "brown", "gold", "khaki", "magenta", "navy"};

  @RequestMapping(value="/web/greeting")
  public String greeting(Model model, @RequestParam(value="name")String name) {
    counter2.incrementAndGet();
    int randomNumber = (int)(Math.random() * hellos.length);
    int randomNumber2 = (int) (Math.random() * colors.length);
    model.addAttribute("hello",hellos[randomNumber]);
    model.addAttribute("name", name);
    model.addAttribute("counter2", counter2);
    model.addAttribute("color", colors[randomNumber2]);
    return "greeting";
  }
}
