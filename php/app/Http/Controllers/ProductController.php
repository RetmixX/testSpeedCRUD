<?php

namespace App\Http\Controllers;

use App\Models\Product;
use Illuminate\Http\Request;

class ProductController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return Product::all();
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        return response()->json(Product::create(['title'=>$request->title, 'price'=>$request->price]), 201);
    }

    /**
     * Display the specified resource.
     */
    public function show(int $id)
    {
        return Product::find($id);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, int $id)
    {
        $productUpdate = Product::find($id);
        $productUpdate->update;
        return $productUpdate;
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(int $id)
    {
        Product::destroy($id);
        return "Удален";
    }
}
