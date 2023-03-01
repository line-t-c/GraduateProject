// SHOW OR HIDE SEARCH BAR
let form = document.querySelector('.d-flex');
let input = document.querySelector('#search-input');

form.addEventListener('mouseover', function() {
    input.style.display = 'block';
});

form.addEventListener('mouseout', function() {
    input.style.display = 'none';
});

// SHOW INGREDIENT TIPS



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

// FILTER BY DIET TAG AND INGREDIENT
let ingredientsSearch = document.getElementById("ingredientsSearch");

function filterRecipes(diet) {
  let url = "/search?ingredients=" + encodeURIComponent(ingredientsSearch.value) + "&diet=" + encodeURIComponent(diet);
// redirect to the new URL
  window.location.href = url;

    // get all buttons with the 'diet' class
    const buttons = document.querySelectorAll('.diet');

    // remove the 'active' class from all buttons
    buttons.forEach(button => {
      button.classList.remove('active');
    });

    // add the 'active' class to the clicked button
    event.currentTarget.classList.add('active');
}

function removeFilters() {
  let url = "/search?ingredients=" + encodeURIComponent(ingredientsSearch.value);
  window.location.href = url;
}

function filterRecipesDietOnly(diet) {
  let url = "/opskrifter?diet=" + encodeURIComponent(diet);
  // redirect to the new URL
  window.location.href = url;

  // get all buttons with the 'diet' class
  const buttons = document.querySelectorAll('.diet');

  // remove the 'active' class from all buttons
  buttons.forEach(button => {
    button.classList.remove('active');
  });

  // add the 'active' class to the clicked button
  event.currentTarget.classList.add('active');
}


function removeDietFilters() {
  let url = "/opskrifter";
  window.location.href = url;
}


