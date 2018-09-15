# Module 1.2 Exercise 2

## Задание

<p>Необходимо реализовать коллекцию, которая имеет фиксированный размер.</p>
<p>Размер задаётся:
<ul>
    <li>по умолчанию 16</li>
    <li>по указанию пользователя</li>
</ul>
</p>
<p>
Размер коллекции после инициализации меняться не может.<br>
Каждый новый элемент добавляется в конец. После того, как количество элементов достигло максимума - при добавлении нового элемента коллекция "сдвигается" влево.
1-й элемент удаляется, а каждый следующий смещается на один элемент влево.<br>
Результатом выполнения задания должен быть репозиторий с коллекцией, классом, тестирующим данную коллекцию, описанием задания и README файлом с инструкцией по запуску приложения
</p>

### Description
<ol>
    <li>
        <p>
        <strong>Constructors</strong>
        </p>
        <p>
        <code>
            FixSizeCollection collectionDefaultSize = new FixSizeCollection();
        </code>
        </p>
        <p>
        <code>
            FixSizeCollection collectionInitSize = new FixSizeCollection(10);
        </code>
        </p>
    </li>
    <li>
        <p>
            <strong>boolean add(T obj)</strong>
        </p>
        <code>
            collectionDefaultSize.add(10);
        </code>
        <dl>
            <dt>Parameters:</dt>
            <dd>obj</dd>
        </dl>
    </li>
</ol>