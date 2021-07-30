# <h1>JavaThemes</h1></p>
В данном проекте по указанному пути: https://github.com/Krassilnikov-AV/JavaThemes/tree/master/src/main/java/ru/themes, распологаются приложения, в которых рассматриваются основные темы языка Java, такие как Java Core, Java Collection API и др., для более эффективной подготовки к собеседованию.</p> Описание проектов приложено ниже, которое добавлятся по мере добавления приложений.</p>
 _ _ _ _
_**Краткое описание приложений:**_</p>
- _AggregationAndComposition_ - рассматриваются основные моменты агрегации и композиции и их описанием, так же используется наследование.</p>
-
_ _ _ _
<h2>Описание тем</h2></p>
  - _AggregationAndComposition⬇️_</p>
В приведйнном примере рассматриваются приёмы ассоциации: композиции и агрегации. </p>
<h3>Основные  понятия и определения:</h3></p>
Ассоциация – это когда один класс включает в себя другой класс в качестве одного из полей. </p>
 Ассоциация описывается словом «имеет». </p>
 Автомобиль имеет двигатель. Вполне естественно, что он не будет являться наследником двигателя (хотя такая архитектура тоже возможна в некоторых ситуациях). <p>
 Выделяют два частных случая ассоциации: <em>композицию</em> и <em>агрегацию</em>. <p>
 Композиция – это когда двигатель не существует отдельно от автомобиля. Он создается при создании автомобиля и полностью управляется автомобилем. </p>
  В приедённом примере, экземпляр двигателя _car_ будут создаваться в конструкторе автомобиля - это и будет являться композицией. </p>
  В приедённом примере так же, экземпляры двигателей _engineFerrari engineZil_ не будут создаваться в конструкторе автомобиля - это будет агрегация.
 Класс владельца авто можно рассмотреть как пример агрегации, это и есть пример агрегации.</p>
 _**При композиции связь между объектами жёсткая**_, т.е. время жизненного цикла, вхожящего объекта совпадает с временем жизни родительского объекта<p>
  В примере применено наследование, вызываемого объекта класса потомка будет зависит от класса родителя (пример вызова экземпляра класса Truck) </p>
 Особенности наследования:</p>
  - вызов экземпляров класса наследника через класс родитель;</p>
  - можно переопределять методы класса родителя или не переопределять;</p>
  - создавать свои методы класса, расширяя функционал класса родителя</p>
