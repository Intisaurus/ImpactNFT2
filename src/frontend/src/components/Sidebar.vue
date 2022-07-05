<script>
import { MDBNavbarItem } from 'mdb-vue-ui-kit';
export default{
name: 'Sidebar',
components:{
MDBNavbarItem
},
};
</script>

<template>
<div class="sidebar" style="background: white;">
<ul>
   <li class="pt-4 pb-4"><MDBNavbarItem to="/" active >View</MDBNavbarItem></li>
   <li class="pb-4"><MDBNavbarItem to="/create" active >Create</MDBNavbarItem></li>
   <li><MDBNavbarItem to="/complete">Complete</MDBNavbarItem></li>
</ul>
</div>
</template>

<style scoped>
.sidebar {
height: 100vh;
width:120%;
}
ul{
list-style: none;
margin-left:0px;
}
a {
text-decoration: none;
}

</style>