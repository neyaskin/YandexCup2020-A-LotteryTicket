YandexCup2020  

A. Лотерейный билет<br/>

Ограничение времени 1 секунда  <br/>
Ограничение памяти 512Mb  <br/>
Ввод стандартный ввод или input.txt  <br/>
Вывод стандартный вывод или output.txt  <br/>

Решение, проходящее все тесты, будет оценено в 1 балл.  <br/>

На различных мероприятиях команда стажировок регулярно разыгрывает призы в лотерею.  
Организаторы выбирают 10 случайных различных чисел от 1 до 32.  
Каждому участнику выдается лотерейный билет, на котором записаны 6 различных чисел от 1 до 32.  
Билет считается выигрышным, если в нем есть не менее 3 выбранных организаторами числа.  
Помогите Юле, напишите программу, которая будет сообщать, какие билеты выигрышные.  
  
Формат ввода  <br/>

В первой строке входных данных записаны 10 различных целых чисел ai (1≤ai≤32) — выбранные организаторами числа.
Во второй строке записано одно целое число n (1≤n≤1000) — количество лотерейных билетов, выданных на мероприятии.
В каждой из n последующих строк записаны 6 различных целых чисел bj (1≤bj≤32) — числа, записанные на очередном лотерейном билета.

Формат вывода  <br/>
Выведите n строк. Для каждого лотерейного билета в порядке следования во входных данных выведите строку Lucky, 
если билет выигрышный, иначе выведите Unlucky.

Пример <br/>

Ввод: <br/>
1 2 3 4 5 6 7 8 9 32 <br/>
3 <br/>
1 2 10 11 12 13 <br/>
1 2 3 10 11 12 <br/>
32 1 10 20 30 3 <br/>

Вывод: <br/>
Unlucky <br/>
Lucky <br/>
Lucky <br/>

Результаты работы и прохождение тестов  <br/>
![Результат работы](https://github.com/qepqap/YandexCup2020-A-LotteryTicket/tree/master/Resources/ResultWorkProg.jpg) <br/>
![Результат тестирования](https://github.com/qepqap/YandexCup2020-A-LotteryTicket/tree/master/Resources/ResultTest.jpg)
