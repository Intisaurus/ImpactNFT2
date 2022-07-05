<script>
import Header from '@/components/header/Header'

export default {
components: {Header},
setup(){
return {}
}
}
</script>

<template>
<div style="background: #f0f0f0;">
<Header />
<router-view/>
</div>
</template>

<style>
@import url("https://fonts.googleapis.com/css?family=Sarabun");
#app {
  font-family: 'Sarabun', sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

</style>
