/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.caos.dropwizard.core;

import static java.lang.String.format;
import java.util.Optional;

/**
 *
 * @author miguel
 */
public class Template {
    private final String content;
    private final String defaultName;

    public Template(String content, String defaultName) {
        this.content = content;
        this.defaultName = defaultName;
    }
    
    public String render(Optional<String> name) {
        return format(content, name.orElse(defaultName));
    } 
}
