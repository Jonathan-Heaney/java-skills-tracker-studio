package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String codeList() {
        return "<html> <body> " +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here is the list of skills you need to know!</h2>" +
                " <ol> <li>JavaScript</li>" +
                "<li> Python </li>" +
                "<li> SQL </li> </ol>" +
                "</body> </html>";
    }


    @PostMapping("form")
    @ResponseBody
    public String form(@RequestParam String name, String favorite, String secondFavorite, String thirdFavorite) {
        String response =
                "<html>" +
                        "<body>" +
                            "<hl> " + name +
                            "</h1" +
                        " <ol> <li>" + favorite + "</li>" +
                        "<li> " + secondFavorite + "</li>" +
                        "<li> " + thirdFavorite + "</li> </ol>" +
                        "</body" +
                "</html>";
        return response;
    }
    @GetMapping("form")
    @ResponseBody
    public String codeForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                            "<label for='name'> Name: </label>"  +
                            "<input type='text id='name' name='name'>" +
                        "<br>" +
                            "<label for='favorite'> My favorite language: </label>"  +
                            "<select id='favorite' name='favorite'>" +
                                "<option value='JavaScript'>JavaScript</option> " +
                                "<option value='Python'>Python</option> " +
                                "<option value='SQL'>SQL</option> " +
                            "</select>" +
                        "<br>" +
                            "<label for='secondFavorite'> My second favorite language: </label>"  +
                                "<select id='secondFavorite' name='secondFavorite'>" +
                                "<option value='JavaScript'>JavaScript</option> " +
                                "<option value='Python'>Python</option> " +
                                "<option value='SQL'>SQL</option> " +
                            "</select>" +
                        "<br>" +
                            "<label for='thirdFavorite'> My third favorite language: </label>"  +
                                "<select id='thirdFavorite' name='thirdFavorite'>" +
                                "<option value='JavaScript'>JavaScript</option> " +
                                "<option value='Python'>Python</option> " +
                                "<option value='SQL'>SQL</option> " +
                            "</select>" +
                        "<br>" +
                        "<input type='submit'>" +
                        "</form>" +
                        "</html>";
        return html;
    }


}
