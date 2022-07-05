<script>
  import { MDBBtn, MDBNavbar, MDBNavbarToggler, MDBNavbarNav, MDBNavbarItem } from 'mdb-vue-ui-kit';
  export default {
    components: {
      MDBBtn,
      MDBNavbar,
      MDBNavbarToggler,
      MDBNavbarNav,
      MDBNavbarItem
    },
    data() {
    return {}
    }
  };
</script>

<template>
  <header>
    <MDBNavbar expand="lg" light bg="#a9b4bd" container position="sticky"  class="shadow-sm p-2 bg-white">
      <MDBNavbarToggler target="#navbarExample01"></MDBNavbarToggler>
      <MDBNavbarBrand href="#">
       <img
              src="@/assets/impactlogo.jpeg"
              height="30"
              alt="Impact Logo"
              loading="lazy"
       />
      </MDBNavbarBrand>
      <h3>  Elev8 </h3>
      <MDBNavbarNav right collapse="navbarExample01" class="mb-2 mb-lg-0" >
        <MDBNavbarItem to="/login" active >
          Login
        </MDBNavbarItem>
        <MDBNavbarItem to="/register" active >
          Register
        </MDBNavbarItem>
      </MDBNavbarNav>
    </MDBNavbar>
  </header>
</template>

<style scoped>

</style>