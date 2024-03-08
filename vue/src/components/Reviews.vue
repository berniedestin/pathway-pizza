<template>
    <h1>Thank you for choosing Pathway Pizza!</h1>
    <div class="reviews">
        <p>“I tried The Jackson pizza - I don’t know who came up with that, but they’re a genius!”
        -Christopher Guarnera </p>
        <p> “There’s truly no better way to celebrate a job offer than with a Pathway Pizza.”
        -Dr. Isaac Chow
        </p>
        <p>“You made it through the Tech Elevator bootcamp - that calls for a Margherita (pizza, of course), from Pathway Pizza!"
        -Rita Stall
        </p>
        <p>“There’s a pizza for everyone! Even with her New Year’s Resolution, my wife always spares a cheat meal for The Safest Option!” -Doug Amos</p>
        <!-- <p></p> -->
    </div>
</template>

<script>
export{

}
</script>

<style scoped>
@import url('https://fonts.cdnfonts.com/css/cooper-hewitt-book');
@font-face {
    font-family: 'Mandalore Laser Title';
    src: url('../fonts/MandaloreLaserTitle.woff2') format('woff2'),
        url('../fonts/MandaloreLaserTitle.woff') format('woff');
    font-weight: normal;
    font-style: normal;
    font-display: swap;
}
*{
  font-family: 'Cooper Hewitt Book', sans-serif;
}
h1{
  font-family: 'Mandalore Laser Title';
  color: var(--brand-brown-color);
}
.reviews {
  display: flex;
  flex-direction: column;
  margin: auto;
  font-style: italic;
  width: 70%;
  font-size: 1.3em;
  color: #BB554A;
  padding: 40px;
  border-radius: 8px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  background-color: #e6ee741a; 
}

p {
  margin-left: 15px;
  margin-right: 15px;
}
</style>