<script>
import Sidebar from '@/components/Sidebar'
import Programs from '@/components/Programs'
  export default {
  name:'View',
  components: {Sidebar, Programs},
    data() {
      return {}
    }
  }
</script>

<template>
  <router-view/>
  <div class="row">
  <div class="col-1">
    <Sidebar />
    </div>
    <div class =" spacing col-md-9">
    <Programs />
  </div>
  </div>
</template>

<style scoped>
.spacing{
margin-top: 4%;
margin-left: 5%;
margin-right: 5%;
}
</style>
