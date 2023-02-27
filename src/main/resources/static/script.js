// SHOW OR HIDE SEARCH BAR
let form = document.querySelector('.d-flex');
let input = document.querySelector('#search-input');

form.addEventListener('mouseover', function() {
    input.style.display = 'block';
});

form.addEventListener('mouseout', function() {
    input.style.display = 'none';
});


// CHANGE NUMBER OF PORTIONS
function updatePortions(addPortion) {
    let currentPortions = parseInt(document.getElementById('portions').innerHTML);

    // Check if current portion is already 1
    if (currentPortions === 1 && !addPortion) {
        alert("Du kan ikke reducere portionstørrelsen mere");
        return;
    }

    let newPortions = addPortion ? currentPortions + 1 : currentPortions - 1;

    // Update the portion size in the HTML
    document.getElementById('portions').innerHTML = newPortions;

    // Calculate the scaling factor for the ingredients
    let scalingFactor = newPortions / currentPortions;

    // Update the ingredient quantities in the HTML
    let ingredients = document.getElementsByClassName('ingredient-amount');
    for (var i = 0; i < ingredients.length; i++) {
        let oldAmount = parseFloat(ingredients[i].innerHTML);
        let newAmount = oldAmount * scalingFactor;
        ingredients[i].innerHTML = newAmount.toFixed(1);
    }
}

// TASK LINE-THROUGH
function overline(element) {
    if (element.style.textDecoration === 'line-through') {
        element.style.textDecoration = 'none';
    } else {
        element.style.textDecoration = 'line-through';
    }
}