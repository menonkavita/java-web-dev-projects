package org.launchcode.skills_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// Chapter 9 & 10: Spring & Controller Studio
@Controller
public class SkillsController {


//    @RequestMapping(method= {RequestMethod.GET, RequestMethod.POST}, value="/form")
// --- Not Working -----

    // BONUS MISSION 2: page will be visible at localhost:8080/result
    // earlier visible at localhost:8080/form
    @PostMapping("/result")
    @ResponseBody
    public String myPost(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        if(name == null){
            name = "User ";
        }

       //return "Hello " + name;
        return displayResults(name, lang1, lang2, lang3);

//        return "<html>" + "<br>" +
//                "<body>" + "<br>" +
//                "<h1>" + "Hi " + name + "<br>" +
//                "</h1>" + "<br>" +
//                "<h2>" + "Your favorite Programming languages: " + "<br>" +
//                "</h2>" +
//                "<h3>" +
//                lang1 + "<br>" +
//                lang2 + "<br>" +
//                lang3 + "<br>" +
//                "</h3>" +
//                "</body>" +
//                "</html>" ;

    }

    public static String displayResults(String name, String language1, String language2, String language3){
//        return "<html>" + "<br>" +
//                "<body>" + "<br>" +
//                "<h1>" + "Hi " + name + "<br>" +
//                "</h1>" + "<br>" +
//                "<h2>" + "Your favorite Programming languages: " + "<br>" +
//                "</h2>" +
//                "<h3>" +
//                "<ol>" +
//                "<li>" + language1 + "</li>" +
//                "<li>" + language2 + "</li>" +
//                "<li>" + language3 + "</li>" +
//                "</ol>" +
//                "</h3>" +
//                "</body>" +
//                "</html>" ;

        // Bonus Mission 1: Reformat your form page to use a table instead of an ordered list.
        return "<html>" + "<br>" +
                "<body>" + "<br>" +
                "<h1>" + "Hi " + name + "<br>" +
                "</h1>" + "<br>" +
                "<h2>" + "Your favorite Programming languages: " + "<br>" +
                "</h2>" +
                "<h3>" +
                "<table>" +
                "<tr>" +
                "<td>" + "1. " + "</td>" +
                "<td>" + language1 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>" + "2. " + "</td>" +
                "<td>" + language2 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td>" + "3. " + "</td>" +
                "<td>" + language3 + "</td>" +
                "</tr>" +
                "</table>" +
                "</h3>" +
                "</body>" +
                "</html>" ;
    }


    // user form @ localhost:8080/form
    // After BONUS MISSION 2: visible @ localhost:8080/result
    @GetMapping("/form")
    @ResponseBody
    public String displayForm(){
        return "<html>" +
                "<body>" +
                "<form action='/result' method='POST'>" +              // BONUS MISSION 2: Add a new path to the site to display the information from the completed form.
                "<h1>Skills Tracker </h1>" + "<br>" +                  // visible @ localhost:8080/result
                "<label>Enter your name: </label>" + "<br>" +
                "<input type='text' name='name'/>" + "<br>" +
                "<label> Select the following programming languages in your order of preference: " +  "</label>" +  "<br>" +
                "<select name = lang1>" +  "<br>" +
                "<option value = 'Java'> Java </option>" + "<br>" +
                "<option value = 'C++'> C++ </option>" + "<br>" +
                "<option value = 'Python'> Python </option>" + "<br>" +
                "</select>" +  "<br>" +
                "<select name = lang2>" +  "<br>" +
                "<option value = 'Java'> Java </option>" + "<br>" +
                "<option value = 'C++'> C++ </option>" + "<br>" +
                "<option value = 'Python'> Python </option>" + "<br>" +
                "</select>" +  "<br>" +
                "<select name = lang3>" +  "<br>" +
                "<option value = 'Java'> Java </option>" + "<br>" +
                "<option value = 'C++'> C++ </option>" + "<br>" +
                "<option value = 'Python'> Python </option>" + "<br>" +
                "</select>" +  "<br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>" ;
    }

    // user form
    // visible @ localhost:8080
    @GetMapping("/")
    @ResponseBody
    public String initialPage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker </h1>" + "<br>" +
                "<h2>" + "We have a few skills we would like you to learn: " + "</h2>" +
                "<ul>" +
                "<h3>" +
                "<li>" + "Java " + "</li>" +
                "<li>" + "C++ " + "</li>" +
                "<li>" + "Python " + "</li>" +
                "</h3>" +
                "</ul>" +
                "<h3> <a href='/form'> Click to pick your favorite languages</a> </h3>" + "<br>" +
                "</body>" +
                "</html>" ;
    }

}
