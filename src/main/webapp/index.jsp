<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Das Namen Spielchen</title>
</head>
<body>
    <h1>Sage mir deinen Nicknamen und dein Alter</h1>
    <h1>Teilnahme erst ab 18 Jahren</h1>
    <form action="nameServlet" method="GET">
        Player_1 : <input type="text" id="name" name="name">
        Player_1 Alter : <input type="text" id="alter" name="alter">
        <button type="submit">absenden</button>
        <button type="submit" id="exit" name="exit">exit</button>
    </form>
</body>
</html>