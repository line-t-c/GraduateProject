function updatePortions(addPortion) {
    var recipeId = document.getElementById('recipe-id').value;
    var xhr = new XMLHttpRequest();
    xhr.open('PUT', '/recipe/' + recipeId + '/portions?addPortion=' + addPortion, true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            location.reload(); // reload the page after updating the recipe
        }
    };
    xhr.send();
}
