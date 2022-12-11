<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body>
        <?php
// put your code here
        $cliente = new SoapClient('http://localhost:8080/ProyectoSoapServer/servicios?WSDL');


        $holam = $cliente->hello([
                    "name" => 'Jonnathan'
                ])->return;

        $potenc = $cliente->potencia([
                    "base" => 2,
                    "exponente" => 3,
                ])->return;

        $parImp = $cliente->par_impar([
                    "numero" => 10,
                ])->return;

        $diccionario = $cliente->diccionario([
                    "palabra" => 'wan',
                ])->return;

        $suma = $cliente->suma([
                    "Num1" => 20,
                    "Num2" => 2,
                ])->return;

        $resta = $cliente->resta([
                    "Num1" => 16,
                    "Num2" => 8,
                ])->return;

        $multi = $cliente->multiplicacion([
                    "Num1" => 2,
                    "Num2" => 8,
                ])->return;
        
        $login = $cliente->login([
                    "user" => 'Jonnathan',
                    "password" => 'md3108',
                ])->return;


     $resultLogin = ''; 
     
        if($login == 1){
            $resultLogin = 'User succesful..';
        }else{
            $resultLogin = 'Error user..';
        }

        echo 'Valor de la concatenación: ' . '<b>' . $holam . '</b>';
        echo '<br>';
        echo 'Potencia de 2 > 3 es: ' . '<b>' . $potenc . '</b>';
        echo '<br>';
        echo 'El número 10 es: ' . '<b>' . $parImp . '</b>';
        echo '<br>';
        echo 'Diccionario: wan > ' . '<b>' . $diccionario . '</b>';
        echo '<br>';
        echo 'La suma de los numero 20 y 2 es: ' . '<b>' . $suma . '</b>';
        echo '<br>';
        echo 'La resta de los numero 16 y 8 es: ' . '<b>' . $resta . '</b>';
        echo '<br>';
        echo 'La multiplicación de los numero 2 y 4 es: ' . '<b>' . $multi . '</b>';
        echo '<br>';
        echo 'Login is: ' . '<b>' . $resultLogin . '</b>';
        echo '<p>';
        echo '<center><table border="2" style=”width: 100%”>
            <colgroup>
                <col style="width: 30%"/>
                <col style="width: 20%"/>

            </colgroup>
            <thead>
                <tr>
                    <th colspan="2">Jonnathan Gallegos M5B - CONSUMO DE SOAP</th>
                </tr>
                <tr>
                    <th>SOLICITUD</th>
                    <th>RESPUESTA</th>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <td colspan="2"><b><center>Consumo SOAP realizado desde PHP.</center></b></td>
                </tr>
            </tfoot>
            <tbody>
                <tr>
                    <td>Valor de la concatenación: Jonnathan </td>
                    <th>' . $holam . '</th>
                </tr>
                
                <tr>
                    <td>Potencia de 2 > 3 es: </td>
                    <th>' . $potenc . '</th>
                </tr>
                
                <tr>
                    <td>El número 10 es: </td>
                    <th>' . $parImp . '</th>
                </tr>
                
                <tr>
                    <td>Diccionario WAN: </td>
                    <th>' . $diccionario . '</th>
                </tr>
                
                <tr>
                    <td>La suma de los numero 20 y 2 es: </td>
                    <th>' . $suma . '</th>
                </tr>
                
                <tr>
                    <td>La resta de los numero 16 y 8 es: </td>
                    <th>' . $resta . '</th>
                </tr>
                
                <tr>
                    <td>La multiplicación de los numero 2 y 4 es: </td>
                    <th>' . $multi . '</th>
                </tr>
                
                <tr>
                    <td>Login User: Jonnathan ; Password: md3108: </td>
                    <th>' . $resultLogin . '</th>
                </tr>
               
            </tbody>
        </table></center>';
        ?>
    </body>
</html>