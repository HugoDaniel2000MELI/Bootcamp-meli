package com.example.exercisespring.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping
    public String helloWord(){
        return "Olá Mundo!";
    }

    @GetMapping("/{nome}")
    public String helloNome(@PathVariable String nome){
        return "Olá " + nome + " !";
    }

    @GetMapping("/romano/{numero}")
    public String convertDecimalRomano(@PathVariable int numero){
        int vaNum[]= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String vaRom[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            String romano="";
            for(int i=0; i < vaRom.length;i++){
                while(numero>=vaNum[i]){
                    numero-=vaNum[i];
                    romano += vaRom[i];
                }
            }
            return romano;
    }

    @GetMapping("/morse/{word}")
    public String convertWordMorse(@PathVariable String word){
        char[] portuguese = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };

        String userInput = word.toLowerCase();

        char[] chars = userInput.toCharArray();

        String str = "";
        for (char aChar : chars) {
            for (int j = 0; j < portuguese.length; j++) {

                if (portuguese[j] == aChar) {
                    str += morse[j] + " ";
                }
            }
        }
        return  word + "     :    " + str;
    }
  }
