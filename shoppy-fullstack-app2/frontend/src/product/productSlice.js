import { createSlice } from '@reduxjs/toolkit'

const initialState = {
    ProductList: [], //출력용 - 2차원 배열
    products: [], //원본 - 1차원 배열
    product: {}
}

export const productSlice = createSlice({
  name: 'product',
  initialState,
  reducers: {
    createProduct(state, action) {
        const  {ProductList, products} = action.payload;
        state.ProductList = ProductList;
        state.products = products;

    }
  },
})

export const {  createProduct
             } = productSlice.actions   //API 함수 또는 컴포넌트에서 dispatch(액션함수)

export default productSlice.reducer  //store  import