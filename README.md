# Challenge Meli BE- Morse

Se implementa la función translate2human
Se implementan bonus:
Api para traducir texto morse a lenguaje humano y visceversa.
Host de api en cloud público: Heroku

Java 8 y Spring boot 2.4.2

https://meli-morse-challenge.herokuapp.com/

https://meli-morse-challenge.herokuapp.com/translate/2text

Request:
{
    "text":"hola meli"
}

Response:
{
    "text": ".... --- .-.. .-    -- . .-.. .. ",
    "code": 200
}

https://meli-morse-challenge.herokuapp.com/translate/2morse

Request:
{
    "text":".... --- .-.. .-  -- . .-.. .. "
}

Response:
{
    "text": "hola meli",
    "code": 200
}

Se implementa la traducción utilizando el alfabeto americano a-z, 0-9.
