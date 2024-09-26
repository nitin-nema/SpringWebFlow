<form action="next" method="post">
    <label for="phone">Phone:</label>
    <input type="text" id="phone" name="phone" value="${user.phone}" required/>

    <label for="address">Address:</label>
    <input type="text" id="address" name="address" value="${user.address}" required/>

    <input type="submit" value="Next"/>
</form>
