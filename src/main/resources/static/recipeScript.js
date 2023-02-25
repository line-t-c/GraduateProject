const portions = document.querySelector("#portions");
const ingredientAmount = document.querySelector("#ingredientAmount");

const recipe = {
  id: document.querySelector("#recipe-id").value,
  portions: parseInt(document.querySelector("#portions").innerText.split(": ")[1]),
  ingredients: Array.from(document.querySelectorAll(".ingredients li")).map(ingredient => ({
    ingredientName: ingredient.querySelector("span:first-child").innerText,
    amount: parseFloat(ingredient.querySelector("#ingredientAmount").innerText.replace(",", ".")),
    measurement: ingredient.querySelector("span:last-child").innerText
  })),
  getPortions: function() {
    return this.portions;
  },
  setPortions: function(newPortions) {
    this.portions = newPortions;
  },
  getIngredients: function() {
    return this.ingredients;
  }
};



function updatePortions(isPortionAdded) {
  let currentPortions = recipe.getPortions();
  let newPortions = isPortionAdded ? currentPortions + 1 : currentPortions - 1;

  // calculate the scaling factor for the ingredients
  let scalingFactor = newPortions / currentPortions;

  // update the ingredient quantities
  for (let ingredient of recipe.getIngredients()) {
    let oldAmount = ingredient.amount;
    let newAmount = oldAmount * scalingFactor;
    ingredient.amount = newAmount;
  }

  recipe.setPortions(newPortions);

  updateAllArea();
}

function updateAllArea() {
  portions.innerText = "Portioner: " + recipe.getPortions();
  for (let ingredientEl of document.querySelectorAll("#ingredientAmount")) {
    let amount = parseFloat(ingredientEl.innerText.replace(",", "."));
    ingredientEl.innerText = `${amount * (recipe.getPortions() / recipe.portions)}`.replace(".", ",");
  }
}
