
/*
 * Copyright (C) 2018 g_ric
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Easysoft Company
 */
public class string_useful {

    /**
     * La funcion capitalizar_palabra permite hacer mayuscula la primera letra
     * de toda la cadena, sin importar que el resto sea mayuscula y
     * minusculas...
     *
     * Ejemplo:
     *
     * holAMunDO ==> Holamundo
     *
     * @param texto_a_capitalizar
     * @return
     */
    public String capitalizar_palabra(String texto_a_capitalizar) {
        String str = null;

        if (texto_a_capitalizar.isEmpty() || texto_a_capitalizar == null) {
            return str;
        } else {

            String minusculas = texto_a_capitalizar.toLowerCase();

            str = Character.toUpperCase(texto_a_capitalizar.charAt(0)) + minusculas.substring(1, minusculas.length());
        }

        return str;
    }

    public String capitalizar_oracion(String caracter_de_separacion, String texto_a_capitalizar) {
        String str = null;

        if (texto_a_capitalizar.isEmpty() || texto_a_capitalizar == null) {
            return str;
        }else {
            String[] txt = texto_a_capitalizar.split(caracter_de_separacion);
            for (String t : txt) {
                String minusculas = t.toLowerCase();

                str = Character.toUpperCase(t.charAt(0)) + minusculas.substring(1, minusculas.length());

            }
        }

        return str;

    }

    public String capitalizar_oracion(String texto_a_capitalizar) {
        String str = null;

        if (texto_a_capitalizar.isEmpty() || texto_a_capitalizar == null) {
            return str;
        } else {
            String[] txt = texto_a_capitalizar.split(" ");
            for (String t : txt) {
                String minusculas = t.toLowerCase();

                str = Character.toUpperCase(t.charAt(0)) + minusculas.substring(1, minusculas.length());

            }
        }
        return str;

    }
}
