---
# Front matter
lang: ru-RU
title: Защита лабораторной работы №1. Шифры простой замены 
author: "Тохсыров Константин Асланови"
group: NFImd-01-23
institute: RUDN University, Moscow, Russian Federation
date: 2023 Sep 17th

# Formatting
toc: false
slide_level: 2
header-includes: 
 - \metroset{progressbar=frametitle,sectionpage=progressbar,numbering=fraction}
 - '\makeatletter'
 - '\beamer@ignorenonframefalse'
 - '\makeatother'
aspectratio: 43
section-titles: true
theme: metropolis

---

# Результат выполнения лабораторной работы №1

# Цель выполнения лабораторной работы 

## Цель выполнения лабораторной работы

- Цель данной лабораторной работы заключается в ознакомлении с основами алгоритмов шифрования текста, а именно шифрования Цезаря и Атбаш, а также в их реализации. Целью является изучение принципов работы данных методов шифрования и их практическое применение

# Теоретические сведения

## Теоретические сведения. Шифр Цезаря

Шифр Цезаря — это один из простейших и наиболее известных методов шифрования текста. Он назван в честь римского полководца Гая Юлия Цезаря, который, согласно легенде, использовал этот метод для секретной переписки.

Принцип работы шифра Цезаря основан на сдвиге букв алфавита на определенное число позиций. Каждая буква заменяется на букву, идущую в алфавите после сдвига на заданное число позиций.

Пример шифрования: сдвиг алфавита на 3 позиции (shift = 3):
Оригинальное сообщение: HELLO
Зашифрованное сообщение: KHOOR

![Алфавит шифра Цезаря](https://i.imgur.com/ni0uuMv.png){width=70%}

## Теоретические сведения. Шифр Атбаш

Шифр Атбаш — это шифр замены, в котором каждая буква заменяется на свою "зеркальную" букву в алфавите. Алфавит разбивается пополам, и каждая буква заменяется на соответствующую букву из противоположной половины алфавита.

Пример шифрования:
Оригинальное сообщение: HELLO
Зашифрованное сообщение: SVOOL

![Алфавит шифра Атбаш](https://i.imgur.com/t7o42PU.png){width=70%}

# Результат выполнения лабораторной работы

## Результат выполнения лабораторной работы

Постановка задачи:

1. Рализовать шифр Цезаря с произвольным ключом $k$
2. Реализовать шифр Атбаш

## Результат выполнения лабораторной работы. Шифр Цезаря

Алгоритм поиска новых символов и вывода полученного текста на основе принципа формирования шифра Цезаря:

![Функция для запуска работы шифра Цезаря](https://i.imgur.com/1ToCsWA.png){width=80%}

## Результат выполнения лабораторной работы. Шифр Атбаш

Принцип формирования нового алфавита для зашифровки сообщения из введенных данных:

![Функция для запуска работы шифра Атбаш](https://i.imgur.com/PAlem9A.png){width=80%}

## Результат выполнения лабораторной работы

Примеры работы функции по реализации шифров Цезаря и Атбаш:

![Вызов функций](https://i.imgur.com/W4st9kR.png){width=80%}


# Выводы

## Выводы

1. Изучили шифры простой замены
2. Реализовали шифр Цезаря с произвольным ключом $k$
3. Реализовали шифр Атбаш
