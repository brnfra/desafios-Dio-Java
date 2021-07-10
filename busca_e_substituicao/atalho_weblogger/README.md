# Respostas aos desafios do Bootcamp Java na Digital Innovation One.

## Atalhos para o Weblogger Brasil

Você está ajudando a desenvolver um sistema de gerenciamento de
weblog chamado Weblogger Brasil. Embora Weblogger Brasil coloque
todo o conteúdo direto no website em HTML, nem todos autores apreciam 
usar tags HTML em seus textos. Para tornar a vida deles mais fáceis,
Weblogger Brasil oferece uma sintaxe simples chamada atalhos para 
obter alguns efeitos textuais em HTML. Sua tarefa é, dado um documento
escrito com atalhos, traduzi-lo para o HTML apropriado.


Um atalho é usado para colocar texto em itálico. HTML faz isto com as
tags &#60;i&#62; e &#60;/i&#62;, mas no Weblogger Brasil um autor pode simplesmente 
colocar um pedaço de texto entre dois caracteres de sublinhado, '_'.
Portanto, onde um autor escreve

```html
Você _deveria_ ver a foca no zoologico!
```
Weblogger Brasil vai publicar o seguinte:
```html
Você <i>deveria</i> ver a foca no zoologico!
```
Outro atalho serve para colocar texto em negrito, o que, em HTML,
é feito com as tags &#60;b&#62; e &#60;/b&#62;. Weblogger Brasil permite aos autores
fazer o mesmo com pares do caractere asterisco, '*'. Quando um autor 
escreve o texto

```html
Marque a conta *a receber* para *paga*.
```
Weblogger Brasil vai publicar o seguinte:

```html
 Marque a conta <b>a receber</b> para <b>paga</b>.
```
### Entrada

A entrada contem vários casos de teste. Cada caso de teste é 
composto por uma linha que contem uma string texto, com zero ou
mais usos dos atalhos itálico e negrito. Cada texto tem de 1 a 50
caracteres, inclusive. Os únicos caracteres permitidos no texto 
são os caracteres alfabéticos (de 'a' a 'z' e de 'A' a 'Z'), o 
sublinhado ('&#95;'), o asterisco ('*'), o caractere de espaço e os 
símbolos de pontuação ',', ';', '.', '!', '?', '-', '(' e ')'. O 
caractere sublinhado '_' ocorre no texto um número par de vezes. 

O asterisco '*' também aparece um número par de vezes no texto. 
Nenhuma substring do texto entre um par de sublinhados ou entre 
um par de asteriscos pode conter outros sublinhados ou asteriscos,
respectivamente.

### Saída

Para cada linha de entrada seu programa deve gerar uma linha de saída 
com o texto traduzido para HTML como demonstrado nos exemplos abaixo. 
Para tornar itálico um pedaço de texto no HTML, você deve iniciar este
pedaço com a tag &#60;i&#62; e terminá-lo com a tag &#60;/i&#62;. Para texto em negrito,
inicie com &#60;b&#62; e termine com &#60;/b&#62;.

| Exemplo de Entrada | Exemplo de Saída |
| --- | --- |
|Você &#95;deveria&#95; ver a foca no zoologico!|Você &#60;i&#62;deveria&#60;/i&#62; ver a foca no zoologico!|
|Marque a conta &#42;a receber&#42; para &#42;paga&#42;.|Marque a conta &#60;b&#62;a receber&#60;/b&#62; para &#60;b&#62;paga&#60;/b&#62;.|













