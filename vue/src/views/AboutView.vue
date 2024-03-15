<template>
    <h1>about Us</h1>
    <p>Here's the team that made this project happen!</p>
    <div class="container">
        <AboutPerson v-for="member in team" :key="member.name" 
        :name="member.name" :imgUrl="member.imgUrl"
        :linkedInUrl="member.linkedInUrl" :gitHubUrl="member.gitHubUrl" />
    </div>

</template>

<script>
import AboutPerson from '../components/AboutPerson.vue';
export default{
    components:{
        AboutPerson
    },//https://github.com/berniedestin/pathway-pizza/blob/gh-pages/images/About/DB.jpeg
    data(vm) {
        return{
            team:[
                {
                    name: 'Destin Bernie',
                    imgUrl: 'https://github.com/berniedestin/pathway-pizza/blob/gh-pages/images/About/DB.jpeg',
                    linkedInUrl: 'https://www.linkedin.com/in/destin-bernie/',
                    gitHubUrl: 'https://github.com/berniedestin'
                    
                },
                {
                    name: 'Gene Jackson II',
                    imgUrl: 'https://github.com/berniedestin/pathway-pizza/blob/gh-pages/images/About/GJ.jpeg',
                    linkedInUrl: 'https://www.linkedin.com/in/genejacksondeveloper/',
                    gitHubUrl: '#'
                    
                },
                {
                    name: 'Bailey Maben ',
                    imgUrl: 'https://github.com/berniedestin/pathway-pizza/blob/gh-pages/images/About/BM.jpeg',
                    linkedInUrl: 'https://www.linkedin.com/in/baileymaben/',
                    gitHubUrl: '#'
                    
                },
                {
                    name: 'Mohamed Abdi',
                    imgUrl: 'https://github.com/berniedestin/pathway-pizza/blob/gh-pages/images/About/MA.jpeg',
                    linkedInUrl: 'https://www.linkedin.com/in/mohamedabdiohio/',
                    gitHubUrl: '#'
                    
                },
                {
                    name: 'Tanjila Tabassum ',
                    imgUrl: 'https://github.com/berniedestin/pathway-pizza/blob/gh-pages/images/About/TT.jpeg',
                    linkedInUrl: 'https://www.linkedin.com/in/tanjilatabassumdeveloper/',
                    gitHubUrl: '#'
                    
                },
            ]
        }
    },
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
.container{
    display: flex;
    flex-direction: column;
    gap: 1rem;
    margin: 1rem;
}
</style>