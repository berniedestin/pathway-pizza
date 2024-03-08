<template>
    <div class="person-card">
        <img :src="imgUrl" alt="Photo">
        <div class="details">
            <h2>{{ name }}</h2>
            <div class="links">
                <GitHubIcon v-show="gitHubUrl != '#'" :url="gitHubUrl" />
                <LinkedInIcon :url="linkedInUrl" />
            </div>
        </div>
    </div>

</template>

<script>
import GitHubIcon from './icons/IconGithub.vue';
import LinkedInIcon from './icons/IconLinkedIn.vue';

export default{
    data(){
        return{

        }
    },
    props:{
        name: String,
        imgUrl: String,
        linkedInUrl: String,
        gitHubUrl: String
    },
    components:{
        GitHubIcon,
        LinkedInIcon
    },
    computed:{
        // getImgUrl(){
        //     return new URL(`${this.imgUrl}`,import.meta.url);
        // }
    }
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

h2{
  font-family: 'Mandalore Laser Title';
  margin-top: 10px;
  margin-bottom: 0px;
  color: var(--brand-darkred-color);
}
.person-card{
    display: flex;
    gap: 1rem;
    background-color: #a18f6366;
    padding: 1rem;
    border-radius: 1rem;
}
img{
    flex-grow: 0;
    flex-shrink: 0;
    width: 100px;
    height: 100px;
    border-radius: 50px;
}
.details{
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    align-items: flex-start;
}
.links{
    display: flex;
    align-items: center;
    justify-content: center;
}
</style>